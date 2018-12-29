# DesignPatterns-StatePattern


****************************
français
****************************
un supermarché est composé de : plusieurs rayons et plusieurs issues de secours.
une issue de secours peut etre ouvert ou fermée.
l'objectif est d'évacuer ce supermarché. pour évacuer une personne du supermarché, elle est supposée évacuer  à partir d'un rayon donné.
l'évacuation suit les règles suivantes :
1. L'évacuation est faite par les issues ouvertes
2. L'évacuation est faite par l'issue la plus proche du rayon.
3. Si la distance vers les issues de secours est la même, l'évacuation est faite par l'issue qui contient moins de personnes à évacuer.

****************************
english
****************************
a supermarket is composed of: several shelves and several emergency exits.
an emergency exit can be opened or closed.
the goal is to evacuate this supermarket. to evacuate a person from the supermarket, he is supposed to evacuate from a given shelf.
the evacuation follows the following rules :
1. The evacuation is done through the open emergency exits
2. The evacuation is done through the closest emergency exits to the shelf
3. If the distance to the emergency exits is the same, the evacuation is made by the exit which contains fewer people to evacuate.