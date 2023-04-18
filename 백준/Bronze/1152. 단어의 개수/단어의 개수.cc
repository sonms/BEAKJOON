#include <iostream>
#include <string>

using namespace std;

string word;
int many=0;

int main() {
    getline(cin, word);


    for (int i = 0; i < word.length(); i++) {
        if (word[i] == ' ') {
            many += 1;
        }
    }
    
    if (word[0] == ' ' && word[word.length()-1] == ' ') {
        many -= 1;
    }
    if (word[0] != ' ' && word[word.length()-1] != ' ') {
        many += 1;
    }
    
    cout << many << endl;
}