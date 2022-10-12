package com.everis.day6.polymorphism.transformers;

public class OrdinateurTransformer extends AbstractTransformer {

	@Override
	public Object toDTO(Object object) {
		Ordinateur ordinateur = (Ordinateur) object;

		OrdinateurDTO dto = new OrdinateurDTO();

		dto.setBrand(ordinateur.getBrand());
		dto.setHDD(ordinateur.getHDD());
		dto.setMemory(ordinateur.getMemory());

		return dto;
	}

	@Override
	public Object toEntity(Object object) {
		OrdinateurDTO dto = (OrdinateurDTO) object;
		Ordinateur ordinateur = new Ordinateur();

		ordinateur.setBrand(dto.getBrand());
		ordinateur.setHDD(dto.getHDD());
		ordinateur.setMemory(dto.getMemory());

		return ordinateur;
	}

//	public List<OrdinateurDTO> toOrdinateurDTOList(List<Ordinateur> ordinateurList) {
//		List<OrdinateurDTO> dtoList = new ArrayList<OrdinateurDTO>();
//
//		for (Ordinateur ordinateur : ordinateurList) {
//			dtoList.add((OrdinateurDTO) toDTO(ordinateur));
//		}
//
//		return dtoList;
//	}
//
//	public List<Ordinateur> toOrdinateurList(List<OrdinateurDTO> dtoList) {
//		List<Ordinateur> ordinateurList = new ArrayList<Ordinateur>();
//
//		for (OrdinateurDTO dto : dtoList) {
//			ordinateurList.add((Ordinateur) toEntity(dto));
//		}
//
//		return ordinateurList;
//	}

}
