[![Build Status](https://travis-ci.org/HUGB2016/gens.svg?branch=master)](https://travis-ci.org/HUGB2016/gens)
# gens
Late term group assignment in HUGB 2016 at Reykjavík University.

Steps to setup project:
1. Create repo on Github
2. Clone repo locally
3. Gradle init --type java-library
4. Add folder structure to project
5. Add basic java program and test
6. Add application plugin and mainClassName to build.gradle
7. Login to travis-ci.org and give access to github repo
8. Add .travis.yml file to root folder
9. Add badge to README file
10. Add Gradle Wrapper git add -f gradle/wrapper/gradle-wrapper.jar
11. Login to Heroku with toolbelt
12. Create Heroku app, heroku apps:create
13. Add stage task to build.gradle
14. Rename app on Heroku (may need to do, 'git remote remove heroku' and then 'heroku git:remote -a NEWNAME')
15. Add deploy to .travis.yml file
16. Push to Heroku, git push heroku master
17. Add println to Java app to check if it logs on Heroku server