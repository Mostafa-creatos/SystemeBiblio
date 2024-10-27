# Développement d'une API pour la Gestion d'un Système de Bibliothèque

## Objectif
Développer une application backend en utilisant **Spring Boot** pour gérer un système de bibliothèque. Cette application doit permettre la gestion des livres, des auteurs et des emprunteurs, avec la possibilité de gérer les prêts de livres. Utiliser **Git** pour le suivi des versions, **Postman** pour tester l'API et **Jira** pour gérer les étapes du projet.

---

## Fonctionnalités de l'API
L'API REST doit fournir les fonctionnalités suivantes :

### Gestion des Livres
- **Ajouter un livre** : `POST /books`
- **Lister tous les livres** : `GET /books`
- **Consulter un livre spécifique** : `GET /books/{id}`
- **Mettre à jour un livre** : `PUT /books/{id}`
- **Supprimer un livre** : `DELETE /books/{id}`

### Gestion des Auteurs
- **Ajouter un auteur** : `POST /authors`
- **Lister tous les auteurs** : `GET /authors`
- **Consulter un auteur spécifique** : `GET /authors/{id}`
- **Mettre à jour un auteur** : `PUT /authors/{id}`
- **Supprimer un auteur** : `DELETE /authors/{id}`

### Gestion des Emprunteurs
- **Ajouter un emprunteur** : `POST /borrowers`
- **Lister tous les emprunteurs** : `GET /borrowers`
- **Consulter un emprunteur spécifique** : `GET /borrowers/{id}`
- **Mettre à jour un emprunteur** : `PUT /borrowers/{id}`
- **Supprimer un emprunteur** : `DELETE /borrowers/{id}`

### Gestion des Prêts de Livres
- **Enregistrer un prêt** : `POST /loans`
- **Lister tous les prêts en cours** : `GET /loans`
- **Enregistrer le retour d'un livre** : `PUT /loans/{id}/return`

---

## Étapes du Développement

### 1. Configuration Initiale (Spring Boot + Git)
- Créer un nouveau projet **Spring Boot** avec une structure de base pour une API REST.
- Initialiser un dépôt **Git** et faire un premier commit avec le projet de base.
- Publier le dépôt sur une plateforme comme GitHub.

### 2. Gestion de Projet avec Jira
Créer un tableau **Jira** avec les tâches suivantes :
- Initialisation du projet
- Création de l'API pour la gestion des livres
- Création de l'API pour la gestion des auteurs
- Création de l'API pour la gestion des emprunteurs
- Création de l'API pour la gestion des prêts
- Tests avec Postman
- Documentation du projet
- Suivre l’avancement de chaque tâche dans Jira.

### 3. Modélisation des Classes
- **Book** : `id`, `title`, `isbn`, `author`, `availabilityStatus`
- **Author** : `id`, `name`, `biography`
- **Borrower** : `id`, `name`, `contactInfo`
- **Loan** : `id`, `book`, `borrower`, `loanDate`, `returnDate`

### 4. Développement de l'API (Spring Boot)
Implémenter les points de terminaison pour les entités Livre, Auteur, Emprunteur et Prêt (détails ci-dessus).

### 5. Tests avec Postman
- Créer une **collection Postman** pour tester chaque point de terminaison de l'API.
- Tester toutes les fonctionnalités de l'API : CRUD pour chaque entité et gestion des prêts.
- Prendre des **captures d'écran** des tests réussis pour la documentation.

### 6. Documentation et Rapport
Rédiger une documentation simple pour expliquer :
- La structure des classes et les relations entre elles.
- L'utilisation de **Git** pour le contrôle de version (avec capture d'écran de l'historique Git).
- Les étapes suivies dans **Jira** avec des captures d'écran du tableau.
- Les tests Postman avec des exemples de requêtes et de réponses pour chaque point de terminaison.

---

## Critères d'Évaluation
- **Fonctionnalité de l'API** : Tous les points de terminaison doivent fonctionner correctement.
- **Gestion de Version avec Git** : L’historique de Git doit montrer les étapes du développement.
- **Utilisation de Jira** : Le tableau doit être bien organisé, avec un suivi visible des tâches.
- **Qualité des Tests avec Postman** : Les tests doivent être complets et validés.
- **Documentation** : La documentation doit être claire et complète.
