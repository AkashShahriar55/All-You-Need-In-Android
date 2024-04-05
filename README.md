
# All You Need In Android

"All You Need In Android" is a comprehensive project designed to serve as a one-stop resource for Android developers, encompassing a wide array of topics, technologies, and best practices in accordance with the latest guidelines from Google's Android Developer platform.

This project is meticulously crafted to cover every facet of Android development, ensuring that developers of all levels find valuable insights, examples, and implementations to enhance their skills and stay abreast of the ever-evolving Android ecosystem.


## Features

- Modularization
- MVVM Architecture
- Jetpack Compose
- Navigation Component

<br/>
<br/>

> **_NOTE:_**  We will be discussing every topic of Android SDK in terms of [Android Jetpack](https://developer.android.com/jetpack).

## Architecture

Before starting any project we should keep in mind the following things that are most important,

  - Scalability
  - Maintainability 
  - Reusability
  - Extensibility
  - Testability

Keeping these aspects of a well-structured software project there are some architectural principles that any project should follow. For Android the following principles should be followed:

#### [Separation of concern](https://developer.android.com/topic/architecture#separation-of-concerns)

Make fatty Activity or Fragment as lean as possible so that we can minimize dependency on them.

#### [Drive UI from data models](https://developer.android.com/topic/architecture#drive-ui-from-model)

Drive UI from persistent data models to prevent data loss, ensure functionality during network issues, and enhance testability and robustness.

#### [Single source of truth](https://developer.android.com/topic/architecture#single-source-of-truth)

Assign a Single Source of Truth (SSOT) to each new data type in your app. The SSOT, which owns and controls the data, exposes it through immutable types and functions/events for modification. Benefits include centralized data changes, data protection, and improved bug tracing. In offline-first apps, the database is often the SSOT; in other cases, it could be a ViewModel or UI.


```kotlin
#ViewModel.kt
private val _searchQuery:MutableStateFlow<String?> = MutableStateFlow(null)
val searchQuery = _searchQuery.asStateFlow()

fun onSearchQuery(query: String) {
    viewModelScope.launch {
        _searchQuery.emit(query)
    }
}

```

#### [Unidirectional Data Flow](https://developer.android.com/topic/architecture#unidirectional-data-flow)

UDF, combined with the SSOT principle, ensures one-way data flow in Android apps, from higher to lower-scoped types. This promotes data consistency, reduces errors, simplifies debugging, and leverages SSOT benefits.





### Modularization

> **_Note:_** Modularization is a practice of organizing a codebase into loosely coupled and self contained parts. Each part is a module. 
> Each module is independent and serves a clear purpose. By dividing a problem into smaller and easier to solve subproblems, 
> you reduce the complexity of designing and maintaining a large system.


![Sample dependency graph](https://developer.android.com/static/topic/modularization/images/1_sample_dep_graph.png)

#### Benefits of modularization 

|          Benefit           |                                                                                            Summary                                                                                             |
|:--------------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
|        Reliability         |  Modularization allows code sharing and creating multiple apps from one foundation. Apps are composed of separate feature modules, each potentially enabled or disabled based on app variants  |
| Strict visibility control  |                         Modules provide control over code exposure, allowing marking internal details to prevent external usage, while maintaining a public interface.                         |
|   Customizable delivery    |                [Play Feature Delivery](https://developer.android.com/guide/playcore/feature-delivery) utilizes app bundles to deliver app features conditionally or on demand.                 |
|        Scalability         |                                       A properly modularized project will embrace the separation of concerns principle and therefore limit the coupling                                        | 
|         Ownership          |                               A module can have a dedicated owner who is responsible for maintaining the code, fixing bugs, adding tests, and reviewing changes.                               |
|       Encapsulation        |                          each part of your code should have the smallest possible amount of knowledge about other parts so that ir is easier to read and understand.                           |
|        Testability         |                                                           A testable code is one where components can be easily tested in isolation.                                                           | 
|         Build time         |               incremental build, build cache or parallel build, can leverage modularity to [improve build performance](https://developer.android.com/build/optimize-your-build).               |

## Authors

- [Akash Shahriar](https://github.com/AkashShahriar55)

