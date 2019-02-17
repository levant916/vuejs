<template>
    <div class="hello">
        <h1>{{ msg }}</h1>
        <H3 v-for="book in bookList" :key="book.id">
            {{book.name}} : {{book.author}} : {{book.pageNember}}
        </H3>
    </div>
</template>

<script>
    export default {
        name: 'HelloWorld',
        props: {
            msg: String,
            bookList: Array
        },
        created() {
            this.axios.get('/api/books').then((resp) => {
                this.bookList = resp.data.response
            })
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    h3 {
        margin: 40px 0 0;
    }

    ul {
        list-style-type: none;
        padding: 0;
    }

    li {
        display: inline-block;
        margin: 0 10px;
    }

    a {
        color: #42b983;
    }
</style>
