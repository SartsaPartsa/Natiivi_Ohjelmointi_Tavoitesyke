# Natiivi_Ohjelmointi_Tavoitesyke

## 📱 Android — Heart Rate Limits (Jetpack Compose)

**Tekijä:** Sara Vehviläinen  
**Oppilaitos:** Oulun ammattikorkeakoulu  
**Kurssi:** Mobiiliohjelmointi natiiviteknologioilla IN00CT07-3009 
**Lukukausi:** Syksy 2025  

---

### 🧩 Tehtävän kuvaus

Tämän tehtävän tavoitteena on toteuttaa Android-sovellus, joka laskee liikunnan tavoitesykkeen ala- ja ylärajat käyttäjän iän perusteella. 
Sovellus tehdään Kotlinilla ja Jetpack Compose -käyttöliittymäkirjastolla.
Tehtävä toimii johdantona:
Jetpack Composen perusrakenteisiin
State-hallintaan (remember, mutableStateOf)
UI-komponentteihin kuten Text, TextField, Column
Peruslaskentaan ja syötteen validointiin

---

### 🧮 Laskentakaavat
- **Ala-arvo:** `(220 - ikä) × 0.65`
- **Yläarvo:** `(220 - ikä) × 0.85`  
- Non-numeerinen tai negatiivinen arvo käsitellään syötteenä 0, jolloin molemmat rajat ovat 0.

---

### ✨ Toiminnallisuus
Käyttäjä syöttää iän tekstikenttään (TextField)
Syöte hyväksyy vain numerot (keyboardType = KeyboardType.Number)
Tulostetaan reaaliajassa:
Tavoitesykkeen alalimit
Tavoitesykkeen ylälimit
Laskentaa tehdään vain, kun ikä on suurempi kuin 0
Tulokset muotoillaan kahden desimaalin tarkkuudella
Tekstit haetaan string-resursseista

---

### 🛠️ Käytetyt teknologiat ja komponentit
- Kotlin
- Android Studio
- Jetpack Compose
- Composable-funktiot
- State-hallinta:
      remember, mutableStateOf, toIntOrNull()
- Material 3 -komponentit
- Resource-hallinta: strings.xml

### 🎯 Oppimistavoitteet
- Jetpack Composen perustaidot
- State-muutosten käsittely Composessa
- Syötteiden validointi (string → int)
- Androidin resurssien hyödyntäminen (strings.xml)
- Sovelluksen perusrakenne Android Studiossa

## 📚 Oppimisresurssit

### Jetpack Compose
https://developer.android.com/jetpack/compose – Virallinen Compose-dokumentaatio 
https://developer.android.com/reference/kotlin/androidx/compose/material3/TextField – Tekstisyötteen käsittely 
https://developer.android.com/jetpack/compose/layouts/basics – Layout-komponentit 
https://developer.android.com/jetpack/compose/state – Tilanhallinta (remember, mutableStateOf)

### Android-dokumentaatio:
https://developer.android.com/docs – Virallinen Android-dokumentaatio 
https://developer.android.com/studio/intro – Android Studion käyttö
https://developer.android.com/studio/run/managing-avds – Emulaattorien hallinta 

### Kotlin:
https://kotlinlang.org/docs/home.html – Kotlin-kielen virallinen dokumentaatio 
https://play.kotlinlang.org/koans/overview – Harjoituksia Kotlinin oppimiseen

