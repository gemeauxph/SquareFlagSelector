Square Flag Selector
=============

<img src="https://i.imgur.com/mnX6W3M.jpg" height="400">

Description
------------
A library which returns a vector drawable of square flags by providing the country name or country code.

## Gradle Dependency

 ``` gradle
dependencies {
    implementation 'com.github.gemeauxph:SquareFlagSelector:1.0.5'
 }
 ```

## Setup

 ``` 
 buildscript {
    repositories {
     .......
        maven { url 'https://jitpack.io' }
    }
}

allprojects {
    repositories {
     .......
        maven { url 'https://www.jitpack.io' }
    }
}
 ```

## Sample Usage

```
myImageView.setImageResource(SquareFlagSelector()
  .getFlagDrawable(SquareFlagSelector().getCountryCode("PH")))
```

or 

```
myImageView.setImageResource(SquareFlagSelector().
  getFlagDrawable("Philippines"))
```
           

