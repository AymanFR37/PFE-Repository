package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.SalleDto;
import ma.geo.gescolarite.mappers.SalleMapper;
import ma.geo.gescolarite.repositories.SalleRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleServiceImpl implements SalleService{
    private SalleRepository salleRepository;

    public SalleServiceImpl(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    private SalleMapper salleMapper = Mappers.getMapper(SalleMapper.class);

    @Override
    public SalleDto addSalle(SalleDto salleDto) {
        SalleDto dto = salleMapper.salleToSalleDto(salleRepository.save(salleMapper.salleDtoToSalle(salleDto)));
        return dto;
    }

    @Override
    public SalleDto updateSalle(int id, SalleDto salleDTO) {
        SalleDto dto = salleMapper.salleToSalleDto(salleRepository.findById(id).orElse(null));
        dto.setNomSalle(salleDTO.getNomSalle());

        SalleDto savedDto = salleMapper.salleToSalleDto(salleRepository.save(salleMapper.salleDtoToSalle(dto)));
        return savedDto;
    }

    @Override
    public void deleteSalleById(int id) {
        salleRepository.deleteById(id);
    }

    @Override
    public List<SalleDto> getAllSalles() {
        return salleMapper.sallesToSallesDtos(salleRepository.findAll());
    }
}
