var gulp        = require('gulp'),
    browserSync = require('browser-sync').create();

gulp.task('server', function() {
    browserSync.init({
        server: {
            baseDir: "./"
        }
    });

    gulp.watch('src/**/*').on('change', browserSync.reload);
});