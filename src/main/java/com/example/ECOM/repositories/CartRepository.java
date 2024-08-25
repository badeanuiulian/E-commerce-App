        package com.example.ECOM.repositories;

        import com.example.ECOM.model.Cart;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;

        import java.util.List;

        public interface CartRepository extends JpaRepository<Cart, Long> {
            @Query("SELECT c FROM Cart c WHERE c.user.email = ?1") //1-->first parameter
            Cart findCartByEmail(String email);

            @Query("SELECT c FROM Cart c WHERE c.user.email = ?1 AND c.id = ?2")
            Cart findCartByEmailAndCartId(String emailId, Long cartId);


           //  JOIN FETCH--> fetch the associated entities in a single query.
            @Query("SELECT c FROM Cart c JOIN FETCH c.cartItems ci JOIN FETCH ci.product p WHERE p.id = ?1")
            List<Cart> findCartsByProductId(Long productId);
        }

