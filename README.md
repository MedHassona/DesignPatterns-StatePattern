# DesignPatterns-StatePattern


****************************
fran�ais
****************************
un supermarch� est compos� de : plusieurs rayons et plusieurs issues de secours.
une issue de secours peut etre ouvert ou ferm�e.
l'objectif est d'�vacuer ce supermarch�. pour �vacuer une personne du supermarch�, elle est suppos�e �vacuer  � partir d'un rayon donn�.
l'�vacuation suit les r�gles suivantes :
1. L'�vacuation est faite par les issues ouvertes
2. L'�vacuation est faite par l'issue la plus proche du rayon.
3. Si la distance vers les issues de secours est la m�me, l'�vacuation est faite par l'issue qui contient moins de personnes � �vacuer.

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