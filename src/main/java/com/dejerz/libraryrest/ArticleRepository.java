package com.dejerz.libraryrest;

import org.springframework.data.jpa.repository.JpaRepository;

interface ArticleRepository extends JpaRepository<Article,Long>{

}