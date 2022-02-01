# U32-OrderingTakeout

Mit dieser Aufgabe sollen Sie die Verwendung von Interfaces üben.
Dabei soll nur die Verwendung des Interfaces und einer Observable-Klasse in Isolation betrachtet werden.

Im Rahmen dieser Aufgabe implementieren Sie ein einfaches Beispiel auf Basis einer Bestellung von Essen (Takeout).

- Gegeben ist eine Klasse `Restaurant` und ein Interface `TakeoutListener`.
- Nutzen sie die statische Methode `getRandomRestaurant` der `Restaurant`-Klasse. Diese gibt eine randomisierte Instanz der Klasse zurück.
- Mithilfe der `order`-Methode kann ein Kunde über dieses Restaurant ein Gericht bestellen. Wie in der echten Welt ist das Gericht auch hier nicht umgehend fertig gekocht. Stattdessen muss eine unbestimmte Zeit gewartet werden.
- Das `TakeoutListener`-Interface dient dazu, darüber informiert zu werden, sobald das Essen fertig zubereitet ist. Ein solcher Listener muss der `order`-Methode als Observer übergeben werden.

Ihre Aufgabe ist es, eine Klasse `Customer` zu implementieren. Diese soll zum `TakeoutListener` werden, damit einzelne `Customers` später darüber informiert werden können, sobald das `Restaurant` bereit ist ihr Essen zu liefern. Ein `Customer` hat einen Namen, ein Lieblingsgericht (es reicht ein String) und ein Lieblingsrestaurant. Ergänzen Sie zusätzliche passende `getter`- und `setter`-Methoden, sowie eine `orderFood`-Methode, mit der ein `Customer` sein Lieblingsessen bei seinem Lieblingsrestaurant bestellen kann.

Außerdem müssen Sie gemäß des `Observer-Patterns` die beiden Methoden des `TakeoutListener`-Interfaces überschreiben. Geben sie an allen Stellen des Bestellvorgangs eine passende Nachricht in der Konsole aus. Sorgen sie weiterhin dafür, dass ein `Customer` automatisch eine Bestellung bei einem anderen, zufälligen Restaurant aufgibt, sofern seine ursprüngliche Bestellung storniert wurde.

Verwenden Sie abschließend die Klasse `Main` als Startpunkt um einen `Customer` mit beliebigem Namen, beliebigem Lieblingsgericht und einem zufälligen Lieblingsrestaurant zu erstellen und ihn bei diesem Essen bestellen zu lassen.

**Hinweis**: Betrachten Sie die `Restaurant`-Klasse als Blackbox und verwenden Sie lediglich die in diesem Handout enthaltenen Informationen zur Klasse, sowie den Punkt-Operator um die Klasse zu bedienen. Ziel ist es, dass sie die `Restaurant`-Klasse verwenden können, ohne exakt zu wissen wie diese intern arbeitet. So können Sie das aus der Vorlesung bekannte Client-Implementer Konzept wiederholen.
