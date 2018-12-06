## Ziel: minimales Blockchain-Framework erschaffen

Die im Framework enthaltenen Komponenten sollen nur das unbedingt nötige an
Funktion implementieren, um das Verständnis der einzelnen Konzepte und deren
Trennung voneinander zu verstehen.

Es soll kein produktionsreifes Framework zur Verwendung in Blockchain-
Anwendungen entwickelt werden. Das Framework dient nur der Weiterbildung und
allerhöchstens noch für Spielereien und Hackathons.

### Komponenten
Folgende grundlegenden Bausteine sollen zum Verständnis selbst programmiert
werden:
  * Datenstruktur "Blockchain"
  * Konsens-Layer/-Bausteine
  * Beliebige Daten als Inhalt der Blockchain
    (Erst Transaktionen, dann beliebiges z.B. Termine, Benachrichtigungen
    (TTL für Einträge zum Speichersparen?))

### Lernziel:
  * Bekannte Software-Engineering Methoden (Kapselung, Loose-Coupling, ...)
    auf neues Anwendungsfeld "Blockchain" anwenden
    -> wartbare Software ohne vorhandene "best practices" im Blockchain-Umfeld

  * Aufzeigen der wichtigen Elemente im Konzept "Blockchain":
    Blöcke (Daten), Chain, Konsens-Layer

  * Bedeutung der einzelnen Elemente:
      Block-Metadaten für Integrität,
      Blockchain als Timeline (= gemeinsame Sicht auf die Welt),
      Konsens-Layer als Absicherung gegen böswillige Teilnehmer oder Spammer

### Umsetzung:
  * Blockchain Client-Anwendung (mit Code-Lücken für Teilnehmer zu füllen)
  * docker-compose -> Starte kleines Netzwerk an Teilnehmern
  * Kommunikation via REST (erlaubt bösartige Manipulationen einfach über cURL o.ä.)

## Ausführung

### Phase 1: Was sind Blöcke und Blockchains?

#### Ziele
    * Vertraut machen mit Umgebung (Projekt importieren, Tests ausführen, "Build")
    * Verständnis des Konzepts "Block" und der Verkettung zu "Blockchains"
    * Verständnis der Abgrenzung zum Konzept "Konsens"

#### Aufgaben
    * Vervollständigung von Codelücken in "Block"- & "Blockchain"-Klassen
    * Erfassen der genauen Anforderungen durch vorhandene Tests (TDD!)
