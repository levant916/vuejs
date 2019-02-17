import Vue from 'vue'
import './plugins/axios'
import App from './App.vue'

Vue.config.productionTip = false

new Vue({
    render: h => h(App),
    methods: {
        handleAgree: function () {
            this.result = 'agree';
        },
        handleDisagree: function () {
            this.result = 'disagree';
        }
    }
}).$mount('#app')
