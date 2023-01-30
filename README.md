#TP POO:
  https://github.com/imaneDraoui/TP3_4_POO
"# TP3_POO" 

 # La dépendence web 
 
La dépendance en Java fait référence à la relation entre les classes dans laquelle une classe dépend d'une autre classe. Cette relation peut être unidirectionnelle ou bidirectionnelle. Dans une relation unidirectionnelle, la classe dépendante n'a aucun contrôle sur la classe dont elle dépend. Dans une relation bidirectionnelle, la classe dépendante a le contrôle sur la classe dont elle dépend. La dépendance en Java est utilisée pour augmenter la réutilisabilité du code et pour réduire la complexité du code.
 # La dépendence  JPA 
 
 JPA (Java Persistence API) est une interface de programmation d'applications Java utilisée pour accéder aux données et les faire persister entre des objets/classes Java et une base de données relationnelle. Elle est couramment utilisée dans les applications d'entreprise Java pour faire correspondre les objets Java aux tables de la base de données et pour simplifier l'accès à la base de données. JPA fournit un moyen d'accéder et de gérer les données entre les objets et une base de données, et il est conçu pour aider à réduire la quantité de code nécessaire pour travailler avec les données dans une base de données relationnelle.
# La dépendence Hibernate 

La dépendance Hibernate assure la prise en charge du cadre de mappage objet-relationnel Hibernate, qui permet de mapper des objets aux tables de la base de données. Elle fournit également des API pour l'interrogation, l'enregistrement et la récupération de données dans une base de données.
# La dépendence H2 

H2 est un système de gestion de base de données relationnelle open source écrit en Java. Il s'agit d'un moteur de base de données léger et intégrable qui prend en charge SQL et d'autres fonctionnalités SQL standard telles que les transactions et les types de données définis par l'utilisateur. Il est souvent utilisé dans les applications Web et les bases de données en mémoire, et est idéal pour les tests et le développement.
# La dépendence DevTools

DevTools est un ensemble d'outils de développement pour Java qui aide les développeurs à créer, déboguer et tester les applications Java. Il fournit des outils de débogage, de profilage, de refactoring et de gestion du code source. Il peut également être utilisé pour créer des applications personnalisées et les intégrer à des applications existantes.

# La dépendence Thymeleaf 
Thymeleaf  est un moteur de modèles Java moderne, côté serveur, utilisé pour créer des pages Web HTML et XML. Il est utilisé pour rendre le contenu dynamique et statique des pages Web et est généralement utilisé en combinaison avec le framework Web Spring MVC. Thymeleaf fournit une approche facile à utiliser et naturelle pour créer des vues dynamiques et structurées pour les applications Web. Il permet de manipuler et de rendre les données de manière naturelle et intuitive, sans que l'utilisateur ait à écrire un code complexe.
# Etape 13
1. La partie du code que avec laquelle on a  paramétré l'url d'appel /greeting est paramétrée dans le controller HelloWorldController.java dans la méthode greeting() est appelée lorsque l'url /greeting est detectée et qui est annotée @RequestMapping avec la valeur "/greeting". 

2. La partie du code que avec laquelle on a choisi le fichier HTML à afficher   correspond au retour de la méthode greeting() dans le controller HelloWorldController.java.

3. On  envoie le nom à qui nous disons bonjour avec le second lien par l'annotation @RequestParam,on récupère la valeur de la variable name dans l'url puis on indique qu'elle n'est pas requise et que dans le cas ou elle est inexistante, on lui donne la valeur "World". Ensuite, on l'associe à la variable nomTemplate du template.
# Etape17
On remarque l'apparition  de la séction address dans la marge à gauche  qui contient ID , CONTENT, CREATION et Indexes  
# Etape 18
L'apparition de la nouvelle table  est dû au Mapping objet relationnel  c'est à dire que la classe address permet de simuler la base de donnée orientée objet à partir de la BD relationnel
# Etape 20
Oui  on voit pas tout le contenu de la table  , tout les insertions
# Etape 23
L’annotation @Autowired permet d’activer l’injection automatique de dépendance. "# TP3_POO" 
# Etape 30
Pour importer Bootstrap dans le projet, on ajouté la référence au CDN de Bootstrap dans la balise head du fichier head.html.

"# TP4_POO" 
# Etape 6:
 * Oui il faut une clé API qui est le Token d'authentification qui nous permet d'appeler MeteoConcept
 *  L'URL a appeler esr : https://api.meteo-concept.com/api/forecast/daily?latlng=[lat]%2C[long]&insee=[codeinsee]  Ou le contenu des crochets est remplacé par les valeurs des paramètres.
 * La methode HTTP utilisé est GET
 * Les paramètres sont passés dans l'url de l'appel .
 * Pour afficher la température du lieu visé par les coordonnées GPS forecast[i]->tmin et forecast[i]->tmax avec i = 0 pour aujourd'hui et i = 1 pour demain, etc.
 * Pour afficher la prévision de météo du lieu visé par les coordonnées GPS  forecast[i]->weather avec i = 0 pour aujourd'hui et i = 1 pour demain, etc.
 