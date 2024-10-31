# Projet de Comptage de Mots

Ce projet a pour objectif de compter les occurrences de chaque mot dans un texte donné. Les résultats sont stockés dans un fichier texte.

## Structure du Projet

- **code source/** : Ce répertoire contient le code source Java.
- **output.txt** : Ce fichier contient la sortie du programme de comptage de mots.

## Instructions d'Utilisation

1. **Compilation du Code Source**  
   Pour compiler le code Java, naviguez dans le répertoire `code source` et exécutez la commande suivante :
   ```bash
   cd code\ source
   javac Main.java
   ```

2. **Exécution du Programme**  
   Après la compilation, vous pouvez exécuter le programme avec la commande :
   ```bash
   java Main
   ```

   Le résultat du programme sera stocké dans le fichier `output.txt` situé dans le répertoire `code source`.

## Fonctionnement

Le programme lit le texte d'entrée se trouvant dans le fichier `code source/resources/purchases.txt`, compte chaque occurrence de chaque mot, puis écrit les résultats dans le fichier `output.txt`. Chaque mot est enregistré avec le nombre de fois qu'il apparaît dans le texte.

## Remarques

- Assurez-vous d'avoir Java installé sur votre machine pour compiler et exécuter le programme.
- Modifiez le fichier d'entrée dans le code si nécessaire pour tester avec différents textes.

## Auteurs

- Mouhamed Lamine Faye
