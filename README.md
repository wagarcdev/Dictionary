# Dictionary
<img src="https://github.com/wagarcdev/Dictionary/blob/master/blob/dictionary.png?raw=true" height="400px" align="left" >


A Dictionary App that implments the [Dictionary API](https://dictionaryapi.dev/) and CACHES the results of the words previously searched.

CACHING implementation consists on making the Repository the 'Single Source of Truth' and making all queries calls to the local Database, and only fetching data from the API when Database does not have the data already cached/stored.

Queries on the API are stored in the local DB.

Made with MVVM Architecture and Jetpack Compose.

