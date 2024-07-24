# 100% Kotlin Multiplatform TODO app

This project is a fully Kotlin-based Multiplatform application designed to run seamlessly on Android, iOS, and Desktop. It leverages Kotlin's ability to share business logic and UI code across platforms, using the Compose Multiplatform for a unified UI experience. The project employs the Voyager library for navigation and MongoDB for database operations. Additionally, it incorporates ViewModel and Flow for state management and reactive programming.

## Features

- **Kotlin Multiplatform**: Share code across Android, iOS, and Desktop.
- **Compose Multiplatform**: Use a single codebase for building UIs across all platforms.
- **Voyager Navigation**: Efficient and easy-to-use navigation library.
- **MongoDB**: Robust and scalable database solution.
- **ViewModel**: Manage UI-related data in a lifecycle-conscious way.
- **Flow**: Reactive programming for asynchronous operations.

## Getting Started

### Prerequisites
- **Android Studio** (for Android development)
- **Xcode** (for iOS run)

### Setup

1. **Clone the repository**
   ```sh
   git clone https://github.com/ViktorLeskov/TODO.git
   cd TODO
   ```

3. **Build the project**
    - For Android: Use Android Studio to build and run the Android app.
    - For iOS: Use Xcode to build and run the iOS app.
    - For Desktop: Use Android Studio to build and run the Desktop app.

### Running the Application

- **Android**:
    - Open the project in Android Studio.
    - Connect an Android device or start an emulator.
    - Click on `Run` to install and launch the application.

- **iOS**:
    - Open the `ios` project in Xcode.
    - Select a simulator or connect a physical device.
    - Click on `Run` to build and launch the application.

- **Desktop**:
    - Open the project in Android Studio.
    - Select "desktopRun"
    - Run the desktop configuration.

## Usage

### Navigation
- Utilize the Voyager library to navigate between screens effortlessly.
- Define navigation routes in the shared module for consistent navigation across platforms.

### Database Operations
- MongoDB is used for database operations.
- Interact with the database using the shared repository classes.

### State Management
- ViewModel is used to manage UI-related data.
- Flow is used for handling asynchronous data streams and updates.

## Contributing

Contributions are welcome! Please follow the standard guidelines for submitting pull requests and issues.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a pull request

## Acknowledgements

- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
- [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)
- [Voyager Library](https://github.com/adrielcafe/voyager)
- [MongoDB](https://www.mongodb.com/)

---

For any questions or further assistance, feel free to open an issue or reach out to the maintainers. Happy coding!