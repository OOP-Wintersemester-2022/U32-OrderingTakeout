# U32-OrderingTakeout

!!! In Bearbeitung. Keine finale Aufgabenstellung

## Vorschlage und Gedanken für Aufgabe

Studierende sollen Anwendung von Interfaces üben.

Dabei soll nur die Verwendung des Interfaces und einer Observable-Klasse in Isolation betrachtet werden und damit einen Anwendungsfall, der APIs wie der View-Klasse in Android ähnlich ist.

So soll das Thema zusammen mit einer ergänzenden zweiten Aufgabe Schritt für Schritt aufgebaut werden.

## Ablauf

Die Studierenden sollen konkret eine Customer-Klasse implementieren. Eine Instanz dieser Klasse fungiert als TakeoutListener und soll sich bei der Bestellung bei einem Restaurant selbst übergeben.
Das Restaurant soll als Blackbox betrachtet werden. Studierende müssen zwei Callback-Methoden überschreiben. Eine für das erhalten der Bestellung und eine falls die Bestellung gecancelled wurde. Dann soll automatisch eine neue Bestellung bei einem anderen Restaurant angefragt werden.

In einer Klasse für den Einstiegspunkt soll dann eine Instanz von Customer erstellt (evtl. mehrere) und über diese eine Bestellung durchgeführt werden.
