# Compte bancaire

1. Créer une classe *abstraite* **CompteBancaire**
cette classe aura: un **solde**, un **client**, une **liste d'operation**(dépôt ou retrait).
2. créer des classes : **ComptePayant**, **CompteEpargne**, **CompteCourant** qui héritent de **CompteBancaire**.
3. Créer une classe **Client** avec les attributs suivant : **nom**,**prénom**,**identifiant**, **liste des comptes** et numéro de téléphone. On créera le client au début de l'application.
4. Créer une classe **Opération** avec les attributs suivants: **numéro**, **montant** et **statut**(dépôt, retrait avec **enum**)
5. Créer un **IHM** pour tester l'application. Pour un compte au choix de l'utilisateur on pourra effectuer un **dépôt**, un **retrait** ou **afficher le solde et les opérations**.