```markdown
# DolanNgalam Development Patterns

> Auto-generated skill from repository analysis

## Overview
This skill teaches the core development patterns and conventions used in the DolanNgalam Kotlin codebase. It covers file structure, naming conventions, import/export styles, and the primary workflow for adding or updating features involving ViewModel and UI components. It also outlines how tests are organized and provides handy commands for common development tasks.

## Coding Conventions

### File Naming
- **PascalCase** is used for Kotlin files.
  - Example: `HomeViewModel.kt`, `HomeScreen.kt`

### Import Style
- **Relative imports** are preferred.
  - Example:
    ```kotlin
    import com.example.dolanngalam.presentation.home.HomeViewModel
    ```

### Export Style
- **Named exports** are used for classes and functions.
  - Example:
    ```kotlin
    class HomeViewModel : ViewModel() { ... }
    ```

## Workflows

### Add or Update ViewModel and UI for Feature
**Trigger:** When you want to add a new feature or enhance an existing one, involving both ViewModel logic and UI presentation.  
**Command:** `/add-feature-viewmodel-ui`

1. **Create or update ViewModel file(s) for the feature**
   - Example: `HomeViewModel.kt`
   - ```kotlin
     class HomeViewModel : ViewModel() {
         // Feature logic here
     }
     ```
2. **Modify or add UI screen files to integrate the ViewModel**
   - Example: `HomeScreen.kt`
   - ```kotlin
     @Composable
     fun HomeScreen(viewModel: HomeViewModel = viewModel()) {
         // UI code using viewModel
     }
     ```
3. **Optionally update shared ViewModel or related files**
   - Example: `sharedViewModel.kt`
   - Update shared logic if needed.
4. **Update IDE/project configuration files (auto-generated or for consistency)**
   - Example: `.idea/inspectionProfiles/Project_Default.xml`
   - Ensure consistency and resolve IDE warnings.

**Files Involved:**
- `app/src/main/java/com/example/dolanngalam/presentation/home/*ViewModel.kt`
- `app/src/main/java/com/example/dolanngalam/presentation/home/*Screen.kt`
- `app/src/main/java/com/example/dolanngalam/presentation/home/sharedViewModel.kt`
- `.idea/inspectionProfiles/Project_Default.xml`

## Testing Patterns

- **Framework:** Unknown (not detected)
- **File pattern:** Test files follow the `*.test.*` naming convention.
  - Example: `HomeViewModel.test.kt`
- **Location:** Typically alongside source files or in a dedicated test directory.

## Commands

| Command                   | Purpose                                                      |
|---------------------------|--------------------------------------------------------------|
| /add-feature-viewmodel-ui | Add or update a feature by modifying ViewModel and UI files. |

```