Feature: Customer Name Addition



  Scenario: Customer Name Addition Test

    Given Trendyol mobile application is launched
    When Login is done.
    And Click on Hesabim
    And Click on Hesap Ayarlarim
    And Click on Adres Bilgilerim
    And Click on Adres Ekle
    And Click on the 'Ad' field in the Iletisim Bilgileri section.
    And Enter a valid value in the 'Ad' field.
    And Click on Kaydet button
    Then Confirm that entering the name is accepted and it proceeds to the next field