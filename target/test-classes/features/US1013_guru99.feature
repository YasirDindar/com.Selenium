
Feature: US_1013 Kullanici web tablosundan istediği degerin varligini test eder
  
  Scenario: TC18 Kullanici tablodan deger test edebilmeli
    
    Given kullanici "guru99Url" anasayfaya gider
    And guru99 cookies kabul eder
    Then Company listesini consola yazdirir
    And "Apollo Hospitals" in listede oldugunu test eder