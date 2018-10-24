(ns app-for-deploy.routes
  (:use compojure.core
        app-for-deploy.views
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]))

(defroutes main-routes
           (GET "/" [] (index-page))
           (route/resources "/")
           (route/not-found "Page not found"))

(def app
  (-> (handler/site main-routes)
      (wrap-base-url)))


