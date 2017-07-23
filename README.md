# Home Library
App to organize our home library and search for suggestions

#### Data Flow
1. The user will input the ISBN number in order to get the meta-data on the book.
2. A REST search to WorldCat for the LCCN (Library of Congress number) and some basic meta-data
3. A REST search to the Library of Congress for complete meta-data
4. 