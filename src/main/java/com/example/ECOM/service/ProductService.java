        package com.example.ECOM.service;

        import com.example.ECOM.payload.ProductDTO;
        import com.example.ECOM.payload.ProductResponse;
        import org.springframework.web.multipart.MultipartFile;

        import java.io.IOException;

        public interface ProductService {
            ProductDTO addProduct(Long categoryId, ProductDTO product);

            ProductResponse getAllProducts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

            ProductResponse searchByCategory(Long categoryId, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

            ProductResponse searchProductByKeyword(String keyword, Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

            ProductDTO updateProduct(Long productId, ProductDTO product);

            ProductDTO deleteProduct(Long productId);

            ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;
        }

