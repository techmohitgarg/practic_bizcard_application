# BizCard Application

A modern Android application built with Jetpack Compose that displays a digital business card with profile information and portfolio items.

## 📱 Project Description

BizCard Application is an Android app that showcases a digital business card interface. It features a clean, modern UI built entirely with Jetpack Compose and Material Design 3. The app displays user profile information including name, job title, and social media handle, along with an interactive portfolio section that can be toggled to show project listings.

## ✨ Features

- **Profile Display**: Circular profile image placeholder with user details
- **Profile Information**: Displays name, job title, and social media handle
- **Interactive Portfolio**: Toggle button to show/hide portfolio items with smooth animations
- **Material Design 3**: Modern UI following Material Design 3 guidelines
- **Lazy Loading**: Optimized portfolio list using LazyColumn for performance
- **Smooth Animations**: Animated visibility transitions for portfolio section

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Design System**: Material Design 3
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 36
- **Build System**: Gradle with Kotlin DSL
- **Compose BOM**: 2024.09.00

## 📁 Project Structure

```
BizCardApplication/
├── app/
│   ├── build.gradle.kts          # App-level build configuration
│   ├── proguard-rules.pro        # ProGuard rules for release builds
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   ├── java/com/mohitgarg/bizcardapplication/
│       │   │   ├── MainActivity.kt                    # Main activity and business card composable
│       │   │   └── ui/
│       │   │       ├── compose/
│       │   │       │   ├── CreateProfileImageCompose.kt    # Circular profile image component
│       │   │       │   ├── PortfolioListCompose.kt        # Portfolio list with lazy loading
│       │   │       │   └── ProfileDetailCompose.kt         # Profile details component
│       │   │       └── theme/
│       │   │           ├── Color.kt                        # Color definitions
│       │   │           ├── Theme.kt                        # Material theme configuration
│       │   │           └── Type.kt                         # Typography definitions
│       │   └── res/
│       │       └── values/
│       │           └── strings.xml                         # String resources
│       ├── androidTest/                                   # Android instrumentation tests
│       └── test/                                          # Unit tests
├── build.gradle.kts              # Project-level build configuration
├── gradle/
│   ├── libs.versions.toml        # Version catalog for dependencies
│   └── wrapper/                   # Gradle wrapper files
├── gradle.properties              # Gradle properties
├── settings.gradle.kts            # Project settings
└── README.md                      # This file
```

## 🏗️ Architecture

The application follows a simple, composable architecture:

- **MainActivity**: Entry point that sets up the Compose UI
- **UI Components**: Modular Compose functions for different parts of the business card:
  - `CreateProfileImageCompose`: Reusable circular profile image component
  - `ProfileDetailCompose`: Profile information display
  - `PortfolioListCompose`: Scrollable list of portfolio items
  - `CreteBiCard`: Main business card composable that combines all components

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog (2023.1.1) or later
- JDK 11 or higher
- Android SDK with API level 24 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd BizCardApplication
   ```

2. Open the project in Android Studio

3. Sync Gradle files (Android Studio will do this automatically)

4. Run the app on an emulator or physical device:
   - Click the "Run" button in Android Studio, or
   - Use the command line: `./gradlew installDebug`

## 📝 Key Components

### CreateProfileImageCompose
A composable function that creates a circular profile image placeholder with a border and shadow elevation. Uses Material Icons' default person icon.

### ProfileDetailCompose
Displays the user's profile information in a vertically arranged column, including:
- Full name (display style, primary color)
- Job title (title medium style)
- Social media handle (body large style)

### PortfolioListCompose
A private composable that renders a scrollable list of portfolio items using LazyColumn. Each item is displayed as a Card with:
- Profile image placeholder
- Project name in bold
- Additional project information

### MainActivity
The main activity that sets up the Compose UI with edge-to-edge support and a Scaffold layout.

## 🎨 UI/UX Features

- **Edge-to-Edge**: Modern Android edge-to-edge display
- **Card-Based Design**: Business card displayed in a Material Card component
- **Smooth Animations**: Fade and expand/shrink animations for portfolio visibility
- **Responsive Layout**: Adapts to different screen sizes
- **Material Design 3**: Follows latest Material Design guidelines

## 📦 Dependencies

Key dependencies include:
- `androidx.compose.ui` - Compose UI framework
- `androidx.compose.material3` - Material Design 3 components
- `androidx.activity.compose` - Activity Compose integration
- `androidx.lifecycle.runtime.ktx` - Lifecycle components
- `androidx.core.ktx` - Android KTX extensions

## 🧪 Testing

The project includes test directories for:
- Unit tests (`test/`)
- Android instrumentation tests (`androidTest/`)

Run tests using:
```bash
./gradlew test          # Unit tests
./gradlew connectedAndroidTest  # Instrumentation tests
```

## 📄 License

This project is part of a practice/learning exercise.

## 👤 Author

**Mohit Garg**
- Android Software Engineer
- @techmohitgarg

## 🔄 Version

- **Version Code**: 1
- **Version Name**: 1.0

---

Built with ❤️ using Jetpack Compose

