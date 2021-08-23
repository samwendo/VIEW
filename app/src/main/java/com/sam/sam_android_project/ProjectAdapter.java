package com.sam.sam_android_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ProjectAdapter extends
        RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    Project[] projects;

    public ProjectAdapter(Project[] projects) {
        this.projects = projects;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_project,
                        parent,
                        false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);

    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {

        private final TextView appTitle;
        private final TextView appDescription;
        private final ImageView appImage;


        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            appTitle = itemView.findViewById(R.id.Text_View_Project_Titel);
            appDescription = itemView.findViewById(R.id.Text_View_Project_Description);
            appImage = itemView.findViewById(R.id.image_View_Project_Icon);


        }

        public void bind(Project project) {
            appTitle.setText(project.Title);
            appDescription.setText(project.Dscription);
            appImage.setImageResource(project.imge);

        }
    }
}
