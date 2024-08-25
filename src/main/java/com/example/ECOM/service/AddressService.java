        package com.example.ECOM.service;

        import com.example.ECOM.model.User;
        import com.example.ECOM.payload.AddressDTO;

        import java.util.List;

        public interface AddressService {
            AddressDTO createAddress(AddressDTO addressDTO, User user);

            List<AddressDTO> getAddresses();

            AddressDTO getAddressesById(Long addressId);

            List<AddressDTO> getUserAddresses(User user);

            AddressDTO updateAddress(Long addressId, AddressDTO addressDTO);

            String deleteAddress(Long addressId);
        }
