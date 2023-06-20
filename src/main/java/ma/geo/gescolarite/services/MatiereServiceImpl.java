package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.MatiereDto;
import ma.geo.gescolarite.mappers.MatiereMapper;
import ma.geo.gescolarite.repositories.MatiereRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatiereServiceImpl implements MatiereService{
    private MatiereRepository matiereRepository;

    public MatiereServiceImpl(MatiereRepository matiereRepository) {
        this.matiereRepository = matiereRepository;
    }
    private MatiereMapper matiereMapper = Mappers.getMapper(MatiereMapper.class);

    @Override
    public MatiereDto createMatiere(MatiereDto matiereDto) {
        MatiereDto dto = matiereMapper.matiereToMatiereDto(matiereRepository.save(matiereMapper.matiereDtoToMatiere(matiereDto)));
        return dto;
    }

    @Override
    public MatiereDto updateMatiere(int id, MatiereDto matiereDto) {
        MatiereDto dto = matiereMapper.matiereToMatiereDto(matiereRepository.findById(id).orElse(null));
        dto.setNomMatiere(matiereDto.getNomMatiere());

        MatiereDto savedDto = matiereMapper.matiereToMatiereDto(matiereRepository.save(matiereMapper.matiereDtoToMatiere(dto)));
        return savedDto;
    }

    @Override
    public void deleteMatiereById(int id) {
        matiereRepository.deleteById(id);
    }

    @Override
    public List<MatiereDto> getAllMatieres() {
        return matiereMapper.matieresToMatieresDtos(matiereRepository.findAll());
    }
}
