Feature: Kullanici Bilgilerim

  Scenario: Kullanici Bilgilerim Test

   Given Trendyol mobile application is launched-SLM
   When Login is done-SLM
   And click on Hesabim
   And click on Hesap Ayarlarim
   And click on Kullanici Bilgilerim
   And click on the 'Ad Soyad' section
   And enter a valid value in the 'Ad Soyad' field
   And see registered e-mail address
   And click on mobile phone section
   And enter valid phone number
   And click the Güncelle button

   Scenario: Name Test-Negative Test-1

    Given Trendyol mobile application is launched-SLM
    When Login is done-SLM
    And click on Hesabim
    And click on Hesap Ayarlarim
    And click on Kullanici Bilgilerim
    And click on the 'Ad Soyad' section
    And Empty the Ad Soyad section
    And see registered e-mail address
    And click on mobile phone section
    And enter valid phone number
    And click the Güncelle button
    Then view the message 'Lütfen adinizi ve soyadinizi giriniz'

    Scenario: Name Test-Negative Test-2

    Given Trendyol mobile application is launched-SLM
    When Login is done-SLM
    And click on Hesabim
    And click on Hesap Ayarlarim
    And click on Kullanici Bilgilerim
    And click on the 'Ad Soyad' section
    And Enter a name of more than 60 characters in the Name field
    Then view the message 'Ad alani 60 karakterden fazla olamaz'"


   Scenario: Last Name Test-Negative Test-1

   Given Trendyol mobile application is launched-SLM
   When Login is done-SLM
   And click on Hesabim
   And click on Hesap Ayarlarim
   And click on Kullanici Bilgilerim
   And click on the 'Ad Soyad' section
   And enter a valid first name and empty the last name
   And click the Güncelle button
   Then view the message 'Lütfen soyadinizi giriniz'

 Scenario: Last Name Test-Negative Test-2

  Given Trendyol mobile application is launched-SLM
  When Login is done-SLM
  And click on Hesabim
  And click on Hesap Ayarlarim
  And click on Kullanici Bilgilerim
  And click on the 'Ad Soyad' section
  And Enter a last name of more than 60 characters in the Name field
  And click the Güncelle button
  Then view the message 'Soyad alani 60 karakterden fazla olamaz'

  Scenario: Phone Number Test-Negative Test-1

  Given Trendyol mobile application is launched-SLM
  When Login is done-SLM
  And click on Hesabim
  And click on Hesap Ayarlarim
  And click on Kullanici Bilgilerim
  And click on the 'Ad Soyad' section
  And enter a valid value in the 'Ad Soyad' field
  And see registered e-mail address
  And click on mobile phone section
  And empty phone number field
  And click the Güncelle button
  Then view the mesaage 'Telefon numarasi alanini doldurunuz'

 Scenario: Phone Number Test-Negative Test-2

 Given Trendyol mobile application is launched-SLM
 When Login is done-SLM
 And click on Hesabim
 And click on Hesap Ayarlarim
 And click on Kullanici Bilgilerim
 And click on the 'Ad Soyad' section
 And enter a valid value in the 'Ad Soyad' field
 And see registered e-mail address
 And click on mobile phone section
 And enter missing phone number
 And click the Güncelle button
 Then view the mesaage 'Gecerli bir telefon numarasi giriniz'

