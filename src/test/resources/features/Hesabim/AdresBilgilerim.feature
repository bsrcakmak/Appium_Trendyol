Feature: Customer Name Addition

  Background:

    Given Trendyol mobile application is launched-BSR
    When Login is done.
    And Click on Hesabim
    And Click on Hesap Ayarlarim
    And Click on Adres Bilgilerim


  Scenario: Address Addition Test-Bireysel

    Given Click on Adres Ekle
    And Click on the 'Ad' field in the Iletisim Bilgileri section and enter a valid value in the 'Ad' field.
    And Click on the 'Soyad' field in the Iletisim Bilgileri section and enter a valid value in the 'Soyad' field
    And Click on the 'Cep Telefonu' field in the Iletisim Bilgileri section and enter a valid value in the 'Cep Telefonu' field
    And Click on the 'il' section in the Adres Bilgileri field and choose a city from the opened list.
    And Click on the 'ilce' section in the Adres Bilgileri field and choose a district from the opened list.
    And Click on the 'Mahalle' section in the Adres Bilgileri field and choose a neighbourhood from the opened list.
    And Click on the 'Adres' field in the Adres Bilgileri section and enter a valid value in the 'Adres' field.
    And Click on the 'Adres Basligi' field in the Adres Bilgileri section and enter a valid value in the 'Adres' field.
    And Select the invoice type as 'Bireysel'.
    And Click on Kaydet button
    Then Confirm that the new address has been added to the address details list.



  Scenario: Address Addition Test-Kurumsal
    And Click on Adres Ekle
    And Click on the 'Ad' field in the Iletisim Bilgileri section and enter a valid value in the 'Ad' field.
    And Click on the 'Soyad' field in the Iletisim Bilgileri section and enter a valid value in the 'Soyad' field
    And Click on the 'Cep Telefonu' field in the Iletisim Bilgileri section and enter a valid value in the 'Cep Telefonu' field
    And Click on the 'il' section in the Adres Bilgileri field and choose a city from the opened list.
    And Click on the 'ilce' section in the Adres Bilgileri field and choose a district from the opened list.
    And Click on the 'Mahalle' section in the Adres Bilgileri field and choose a neighbourhood from the opened list.
    And Click on the 'Adres' field in the Adres Bilgileri section and enter a valid value in the 'Adres' field.
    And Click on the 'Adres Basligi' field in the Adres Bilgileri section and enter a valid value in the 'Adres' field.
    And Select the invoice type as Kurumsal.
    And Click on the 'VKN' field in the Fatura Turu section and enter a valid value in the 'Ad' field.



  Scenario: Customer Name Addition Test

    And Click on Adres Ekle
    And Click on the 'Ad' field in the Iletisim Bilgileri section.
    And Enter a valid value in the 'Ad' field.
    And Click on Kaydet button
    Then Confirm that entering the name is accepted and it proceeds to the next field