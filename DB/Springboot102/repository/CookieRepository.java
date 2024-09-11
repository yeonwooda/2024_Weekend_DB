//package com.example.Springboot102.repository;
//
//import com.example.Springboot102.model.Cookie;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface CookieRepository extends JpaRepository<Cookie, Integer> {
//    //  Query Method : 키워드에 따라서 SQL이 자동완성 됨
//
//    // 1. 비교 연산자( ==, !=, <, > )
//    // Is, Equals(==),
//    Cookie findByNameIs(String name);
//
//    // IsNot, Not(=!)
//    Cookie findByNameIsNot(String name);
//
//    // GreaterThan(>), GreaterThanEqual(>=),  LessThan(<), LessThanEqual(<=), between(~사이)
//    List<Cookie> findByPriceGreaterThan(Integer integer);
//    List<Cookie> fineByPriceBetween(Integer start, Integer end);
//
//    // 2. 논리 연산자 (And &&, Or ||)
//    List<Cookie> findByNameAndPrice(String name, Integer price);
//    List<Cookie> findByNameOrPrice(String name, Integer price);
//
//    // 네이티브 쿼리 또는 JPQL이라고 불림
//    @Query("SELECT name FROM COOKIE WHERE COOKIE.NAME = :nickname")
//    List<Cookie> findByNameABCD(@Param("nickname") String nickname);
//
//}
//
