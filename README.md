# Login App (Java)

Mar 20, 2021 | This project was created when I was in 10th grade at vocational school as a beginner Android practice app.  
It demonstrates a simple login flow by validating input against expected credentials and handling both success and failure states.

---

## Preview (Screenshots)

| Login Screen | Success Toast | Failed Toast |
|---|---|---|
| ![Login Screen](docs/login.png) | ![Login Success](docs/success.png) | ![Main Screen](docs/failed.png) |

---

## Features

- Login form with email & password input
- Simple credential check (demo / hardcoded)
- Feedback using Toast message (**success** / **failed**)

---

## Tech Stack

- **Language:** Java
- **Build System:** Gradle
- **AndroidX:** AppCompat
- **UI:** Material Components, ConstraintLayout  
- **compileSdk / targetSdk:** 30  
- **minSdk:** 16

---

## Project Structure (High Level)

- `app/` - Android application module
- `app/src/main/java/...` - Activities & app logic
- `app/src/main/res/` - Layouts, strings, colors, themes
- `gradle/` + `gradlew*` - Gradle wrapper files

---

## Getting Started

### Requirements
- Android Studio (recommended: a modern version)
- JDK 11 (recommended for older Gradle/AGP projects)
- Android SDK Platform 30 installed (compileSdk 30)

### Run Locally
1. Clone the repository:
   ```bash
   git clone https://github.com/Aryosetowmn/androiddev_kelas10semester1.git
   ```
2. Open the project in **Android Studio**
3. Wait for **Gradle Sync** to finish
4. Run on:
   - Emulator (Device Manager), or
   - Physical Android device (USB Debugging enabled)

---

## Demo Credentials

Use these credentials to trigger the successful login flow:

- **Email:** `makanbakso@gmail.com`
- **Password:** `123456`

---

## Notes

This repository is intended for learning and portfolio demonstration.  
For real-world applications, you should replace hardcoded credentials with secure authentication (e.g., API + token-based auth) and proper input validation.

---

## Author

**Aryosetowmn**  
Repository: `Aryosetowmn/androiddev_kelas10semester1`
