<template>
  <div id="app">
    <h1>电影列表</h1>
    <ul v-for="movie in movies" :key="movie.id">
      <li>{{ movie.title }} - {{ movie.year }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      movies: []
    }
  },
  created() {
    this.$axios.get('/api/movies')
      .then(response => {
        this.movies = response.data;
      });
  }
}
</script>