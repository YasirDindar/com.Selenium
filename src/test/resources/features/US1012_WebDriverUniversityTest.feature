
  Feature: US1012 Window Testi

    Scenario: TC17 kullanici yeni acilan window'u test edebilmeli

      Given kullanici "wduUrl" anasayfaya gider
      Then Login Portal elementine kadar asagi iner
      And Login Portal a tiklar
      Then Yeni window’a gecer
      And username kutusuna deger yazar
      And password kutusuna deger yazar
      Then webunuversity login butonuna basar
      And Popup ta cikan yazinin validation failed oldugunu test eder
      Then Ok diyerek Popup’i kapatir
      And Ilk sayfaya geri donun
      And Ilk sayfaya donuldugunu test edin
      And tum acilan sayfalari kapatir

