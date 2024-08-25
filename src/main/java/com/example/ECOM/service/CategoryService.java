        package com.example.ECOM.service;
        import com.example.ECOM.payload.CategoryDTO;
        import com.example.ECOM.payload.CategoryResponse;

        public interface CategoryService {
            CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
            CategoryDTO createCategory(CategoryDTO categoryDTO);

            CategoryDTO deleteCategory(Long categoryId);

            CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
        }