(defproject app-for-deploy "0.1.0-SNAPSHOT"
  :description "Demo app for deploy"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.1.1"]
                 [hiccup "1.0.0"]]
  :plugins [[lein-ring "0.7.1"]]
  :ring {:handler app-for-deploy.routes/app
         :open-browser? false
         :port 8000})
