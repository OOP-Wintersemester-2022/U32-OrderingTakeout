# U32-OrderingTakeout

Mit dieser Aufgabe sollen Sie die Verwendung von Interfaces üben.
Dabei soll nur die Verwendung des Interfaces und einer Observable-Klasse in Isolation betrachtet werden.

Im Rahmen dieser Aufgabe implementieren Sie ein einfaches Beispiel auf Basis einer Bestellung von Essen (Takeout).

Sie implementieren eine Klasse Customer in der Sie ein gegebenes `Interface` verweden und zwei Callback-Methoden überschreiben. Eine für das erhalten der Bestellung und eine falls die Bestellung gecancelled wurde. Dann soll automatisch eine neue Bestellung bei einem anderen Restaurant angefragt werden.
Die Klasse Restaurant ist dabei gegeben und soll als Blackbox betrachtet werden.

In einer Klasse für den Einstiegspunkt soll dann eine Instanz von Customer erstellt (evtl. mehrere) und über diese eine Bestellung durchgeführt werden.
