
Feature: US1009 Yanlis kullanici adi ve password listesi ile negatif login testi

  Scenario Outline:  T14 yanlis kullanici listesi ile giris yapilamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    Then kullanici cookie'yi onaylar
    And kullanici kutusuna manuel olarak "<yanlisUsername>" yazar
    And password kutusuna manuel olarak "<yanlisPassword>" yazar
    And login butonuna basar
    And 5 saniye bekler
    And giris yapilamadigini test eder
    Then sayfayi kapatir


    Examples:
    |yanlisUsername  |yanlisPassword
    |yasir   |yasir@a.com
    |mehmet  |mehmet@b.com
    |yasar   |yasar@c.com
    |adem    |adem@d.com
    |ozgur   |ozgur@e.com