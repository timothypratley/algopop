(ns algopop.website.pages
  (:require [hiccup.page :as page]))

(defn home [dev?]
  (page/html5
   [:head
    [:title "Algopop"]
    [:meta {:charset "utf-8"}]
    [:meta {:http-equiv "X-UA-Compatible" :content "IE edge,chrome 1"}]
    [:meta {:name "viewport" :content "width device-width, initial-scale 1"}]
    [:link {:rel "apple-touch-icon" :sizes "57x57" :href "/apple-touch-icon-57x57.png"}]
    [:link {:rel "apple-touch-icon" :sizes "60x60" :href "/apple-touch-icon-60x60.png"}]
    [:link {:rel "apple-touch-icon" :sizes "72x72" :href "/apple-touch-icon-72x72.png"}]
    [:link {:rel "apple-touch-icon" :sizes "76x76" :href "/apple-touch-icon-76x76.png"}]
    [:link {:rel "apple-touch-icon" :sizes "114x114" :href "/apple-touch-icon-114x114.png"}]
    [:link {:rel "apple-touch-icon" :sizes "120x120" :href "/apple-touch-icon-120x120.png"}]
    [:link {:rel "apple-touch-icon" :sizes "144x144" :href "/apple-touch-icon-144x144.png"}]
    [:link {:rel "apple-touch-icon" :sizes "152x152" :href "/apple-touch-icon-152x152.png"}]
    [:link {:rel "apple-touch-icon" :sizes "180x180" :href "/apple-touch-icon-180x180.png"}]
    [:link {:rel "icon" :type "image/png" :href "/favicon-32x32.png" :sizes "32x32"}]
    [:link {:rel "icon" :type "image/png" :href "/android-chrome-192x192.png" :sizes "192x192"}]
    [:link {:rel "icon" :type "image/png" :href "/favicon-96x96.png" :sizes "96x96"}]
    [:link {:rel "icon" :type "image/png" :href "/favicon-16x16.png" :sizes "16x16"}]
    [:link {:rel "manifest" :href "/manifest.json"}]
    [:meta {:name "msapplication-TileColor" :content "#da532c"}]
    [:meta {:name "msapplication-TileImage" :content "/mstile-144x144.png"}]
    [:meta {:name "theme-color" :content "#ffffff"}]
    [:link {:rel "stylesheet" :href "css/site.css"}]
    [:link {:rel "stylesheet" :href "//netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"}]
    [:script {:src "https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"}]
    [:script {:src "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"}]
    [:script "(function (i,s,o,g,r,a,m) {i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
(i[r].q=i[r].q|| []).push (arguments)},i [r].l=1*new Date ();a=s.createElement(o),
m=s.getElementsByTagName (o) [0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
) (window,document,'script','//www.google-analytics.com/analytics.js','ga');
ga ('create', 'UA-40336415-4', 'auto');
ga ('send', 'pageview');"]]
   [:body
    [:div {:id "app"}]
    [:script {:src "js/app.js" :type "text/javascript"}]]))
