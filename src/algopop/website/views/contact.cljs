 (ns algopop.website.views.contact)

(defn contact-page []
  [:div
   [:div.jumbotron
    [:h2 "Let's talk."]
    [:p "We are here to make your new webapp pop."]]
   [:div
    [:dl.dl-horizontal
     [:dt "General"] [:dd "1-313-288-9881"]
     [:dt "Sales and Support"] [:dd "1-313-288-9883"]
     [:dt "Email"] [:dd "timothypratley@gmail.com"]
     [:dt "Address"] [:dd "1440 Broadway, Suite 401, Oakland CA, USA"]]]])
