
Feature: US1011 Kullanici herokuapp sayfasinda butonlarin gorunur oldugunu test eder

  Scenario: TC16 kullanici bekleyerek butonlarin gorunur olmasini saglar

    Given kullanici "herokuappUrl" anasayfaya gider
    Then add Element butonuna basar
    And Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna basarak butonu siler
    And Delete butonunun gorunmedigini test edin

