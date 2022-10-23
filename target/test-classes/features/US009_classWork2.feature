Feature: US009 Class Work 2

Scenario: HerOkuApp sitesi buton tarama

And kullanici "https://the-internet.herokuapp.com/add_remove_elements/" adresine gider
  And kullanici 1 saniye bekler
And "Add Element" butona basin
  And kullanici 1 saniye bekler
And "Delete" butonu gorunur oluncaya kadar bekleyin
  And kullanici 1 saniye bekler
And "Delete" butonunun gorunur oldugunu test edin
  And kullanici 1 saniye bekler
And Delete butonuna basarak butonu silin
  And kullanici 1 saniye bekler
And Delete butonunun gorunmedigini test edin
  And kullanici 1 saniye bekler
And sayfayi kapatir