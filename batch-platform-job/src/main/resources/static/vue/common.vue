<template>
    
</template>

<script src="https://cdn.staticfile.org/vue/2.2.2/vue.min.js"></script>
<script src="https://cdn.staticfile.org/axios/0.18.0/axios.min.js"></script>
<script>
    /** axios 的 baseUrl 设值 */
    import axios from 'axios'
    axios.defaults.baseURL = 'http://localhost:9026';
    Vue.prototype.$http = axios
</script>

<style scoped>

</style>