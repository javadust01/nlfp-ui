# nlfp-ui

NLFP UI based on Spring Boot and Vue.js.
Start backend and front end separately to enable hot reload.

# Build and start Spring Boot app

### Prerequisites

Run `mvn install` if not run before. This will download `node`  and `yarn` locally.
We're using [yarn](https://yarnpkg.com/lang/en/) as our package manager (instead of NPM).

Check that node and yarn is installed by running `node -v` and `yarn -v`. These commands will return the node and yarn version of node and yarn are installed. 
If they are not found, follow the installation docs at [Installing Node](https://nodejs.org/en/download/) and [Installing Yarn](https://yarnpkg.com/lang/en/docs/install/).

```bash
mvn clean install
mvn spring-boot:run
``` 

Open `http://localhost:8087/nlfp-ui/`

# Build setup frontend

### Prerequisites



### Build

If you want to start the app with hot reload, start app as described above and then start frontend:

``` bash
cd frontend

# install dependencies
./yarn install

# to serve with hot reload at localhost:8080 (opens the app in your browser automatically)
yarn && yarn dev

# build for production with minification
./yarn run build

# build for production and view the bundle analyzer report
./yarn run build --report

# run unit tests
yarn run unit

# run e2e tests
./yarn run e2e

# run all tests
./yarn test
```

For detailed explanation on how things work, checkout the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).
	


