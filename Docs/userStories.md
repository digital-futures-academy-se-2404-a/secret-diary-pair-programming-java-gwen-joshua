User Stories

### Requirement 1<br/>
User Story:<br/>
    As a Customer<br/>
    I want to be able to write in the diary<br/>
    So That I can keep diary entries<br/>
Domain Model:

| Objects | Properties             | Messages            | Output |
|---------|------------------------|---------------------|--------|
| Diary   | entries Array[@String] | writeEntry(@string) | @void  |
Tests:<br/>
    1: Check that writeEntry(string) successfully adds valid input to Dairy<br/>
    2: Check that writeEntry successfully adds extreme valid input to Diary<br/>
    3: Check that writeEntry handles wrong data types correctly<br/>


### Requirement 2<br/>
User Story:<br/>
    As a Customer<br/>
    I want to be able to read past diary entries<br/>
    So That I can reminisce<br/>
Domain Model:

| Objects | Properties             | Messages                                | Output                     |
|---------|------------------------|-----------------------------------------|----------------------------|
| Diary   | entries Array[@String] | <br/>readEntry(@number)<br/>readAllEntries() | @void<br/>@Array [@string] |
Tests:<br/>
    1: Check that readEntry(num) successfully returns a specific valid string from entries<br/>
    2: Check that readEntry handles incorrect data types<br/>
    3: Check that readEntry handles negative numbers<br/>
    4: Check that readEntry handles numbers that are larger than the current array size<br/>
    3: Check that getEntries() returns all entries in diary<br/>


### Requirement 3<br/>
User Story:<br/>
    As a Diary Owner<br/>
    I want to be able to lock the diary<br/>
    So That people can't read or write in it<br/>
Domain Model:

| Objects | Properties             | Messages                                            | Output                               |
|---------|------------------------|-----------------------------------------------------|--------------------------------------|
| Diary   | entries Array[@String] | writeEntry(@string)<br/>lock()<br/>readAllEntries() | @void<br/>@void<br/>@Array [@string] |
Tests:<br/>
    1: Check that lock() successfully locks the diary<br/>
    2: Check that writeEntry(string) does not add to entries when diary is locked<br/>
    3: Check that getEntries() does not return entries when diary is locked<br/>
    4: Check that getEntry does not return an entry when the Diary is locked


### Requirement 4<br/>
user Story:<br/>
        As a Diary Owner<br/>
        I want to be able to Unlock the Diary using a pin<br/>
        So That I can still read and write in it<br/>
    Domain Model:<br/>

| Objects | Properties             | Messages                                                     | Output                                 |
|---------|------------------------|--------------------------------------------------------------|----------------------------------------|
| Diary   | entries Array[@String] | readAllEntries()<br/>unlock(@number)<br/>writeEntry(@string) | @Array [@string]<br/>@String<br/>@void |
Tests:<br/>
    1: Check that unlock(num) successfully unlocks the diary when the correct pin in inputted<br/>
    2: Check that unlock(num) does not unlock the diary when the incorrect pin is inputted<br/>
    3: Check that unlock(num) does not unlock the diary when invalid input in inputted (Negative number)<br/>
    4: Check that unlock(num) does not unlock the diary when invalid input in inputted (Data Type Mismatch)<br/>
    5: Check that writeEntry(string) successfully adds entry to entries when diary has been unlocked<br/>
    6: Check that getEntries() successfully returns all entries when diary has been unlocked<br/>





