        package com.example.ECOM.repositories;

        import com.example.ECOM.model.Address;
        import org.springframework.data.jpa.repository.JpaRepository;

        public interface AddressRepository extends JpaRepository<Address, Long> {
        }
