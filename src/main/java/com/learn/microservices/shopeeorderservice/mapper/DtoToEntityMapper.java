package com.learn.microservices.shopeeorderservice.mapper;

import org.springframework.stereotype.Component;

@Component
public class DtoToEntityMapper {

	/*
	 * public UserInfo userInfoDtoToEntity(UserInfoDTO userInfoDTO) throws Exception
	 * { UserInfo userInfoEntity = new UserInfo();
	 * userInfoEntity.setAlternatePhoneNumber(userInfoDTO.getAlternatePhoneNumber())
	 * ; userInfoEntity.setActive(userInfoDTO.isActive());
	 * userInfoEntity.setActivationStatus(userInfoDTO.getActivationStatus());
	 * userInfoEntity.setEmailAddress(userInfoDTO.getEmailAddress());
	 * userInfoEntity.setFirstName(userInfoDTO.getFirstName());
	 * CustomBeanUtils.copyProperties(userInfoDTO, userInfoEntity);
	 * userInfoEntity.setActivationStatus(AccountStatusEnum.CREATED.name());
	 * 
	 * if (!CollectionUtils.isEmpty(userInfoDTO.getContactAddresses())) {
	 * userInfoDTO.getContactAddresses() .forEach(addrDTO ->
	 * userInfoEntity.putContactAddress(addressDtoToEntity(addrDTO,
	 * userInfoEntity)));
	 * 
	 * } return userInfoEntity; }
	 * 
	 * public Address addressDtoToEntity(AddressDTO addressDTO, UserInfo
	 * userInfoEntity) { Address addressEntity = new Address();
	 * CustomBeanUtils.copyProperties(addressDTO, addressEntity);
	 * addressEntity.setUserInfo(userInfoEntity); return addressEntity; }
	 */
}
