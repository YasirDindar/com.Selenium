
  Feature: Kullanici yanlis bilgilerle giris yapamaz

    Scenario: TC10 Gecerli kullanici adi ve gecersiz sifre ile negatif Login Testi

      Given kullanici "qdUrl" anasayfaya gider
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecerliUsername" yazar
      And password kutusuna "qdGecersizPassword" yazar
      And 3 saniye bekler
      Then login butonuna basar
      And giris yapilamadigini test eder
      Then sayfayi kapatir


    Scenario: TC10 Gecersiz kullanici adi ve gecerli sifre ile negatif Login Testi

      Given kullanici "qdUrl" anasayfaya gider
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecersizUsername" yazar
      And password kutusuna "qdGecerliPassword" yazar
      And 3 saniye bekler
      Then login butonuna basar
      And giris yapilamadigini test eder
      Then sayfayi kapatir


    Scenario: TC10 Gecersiz kullanici adi ve gecersiz sifre ile negatif Login Testi

      Given kullanici "qdUrl" anasayfaya gider
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecersizUsername" yazar
      And password kutusuna "qdGecersizPassword" yazar
      And 3 saniye bekler
      Then login butonuna basar
      And giris yapilamadigini test eder
      Then sayfayi kapatir