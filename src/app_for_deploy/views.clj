(ns app-for-deploy.views
  (:use [hiccup core page]))

(defn index-page []
  (html5
    [:head
     [:title "Hello World"]]
    [:body
     [:h1 "Hello World!"]]))