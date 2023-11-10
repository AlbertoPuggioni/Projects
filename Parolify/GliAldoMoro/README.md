# Parolify

## Descrizione del progetto

Parolify è un'applicazione web sviluppata con Spring Boot in Java. Questo progetto ti permette di analizzare il testo inserito tramite un modulo. Il testo verrà scomposto e i dati relativi saranno salvati nel database. In una seconda visualizzazione, saranno mostrate le seguenti informazioni: il numero di parole, il numero di frasi, la parola più utilizzata, la parola più lunga, la parola più utilizzata per frase e la parola più lunga per frase.

## Funzionalità principali

- **Form di inserimento del testo**: L'applicazione offre un modulo in cui è possibile inserire il testo da analizzare.
- **Analisi del testo**: Dopo aver inviato il testo tramite il modulo, l'applicazione scomporrà il testo e calcolerà le seguenti metriche: il numero di parole, il numero di frasi, la parola più utilizzata, la parola più lunga, la parola più utilizzata per frase e la parola più lunga per frase.
- **Visualizzazione dei risultati**: I risultati dell'analisi saranno salvati nel database e mostrati in una seconda vista. Qui potrai visualizzare tutte le informazioni relative al testo inserito.

## Tecnologie utilizzate

- Java
- Spring Boot
- HTML
- CSS
- MySQL (database)

## Requisiti di installazione

Per eseguire correttamente l'applicazione, sono necessari i seguenti requisiti:

- Java Development Kit (JDK) 11 o versione successiva installato nel sistema.
- Un server MySQL in esecuzione o un altro database compatibile (preferibilmente xampp, le porte sono 3066 e 8080).
- Un ambiente di sviluppo integrato (IDE) come IntelliJ IDEA o Eclipse.
- Maven per la gestione delle dipendenze.

## Guida all'installazione

1. Clona il repository GitHub del progetto Text Analyzer nel tuo ambiente di sviluppo:

```shell
git clone https://github.com/bruns06/GliAldoMoro.git
```

2. Apri il progetto nel tuo IDE preferito.
3. Configura le informazioni di connessione al database nel file application.properties.
4. Esegui il comando Maven per importare le dipendenze del progetto:

```shell
mvn install
```

5. Avvia l'applicazione eseguendo il comando Maven:

```shell
mvn spring-boot:run
```

6. L'applicazione sarà accessibile all'indirizzo http://localhost:2506 nel tuo browser web.

Speriamo che troverai utile l'applicazione Parolify. Buon divertimento nell'analisi dei tuoi testi!
